package org.spring.family.springbootmybatis.config;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import com.alibaba.druid.pool.DruidDataSource;
 
@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = DuridConfig.PACKAGE, sqlSessionFactoryRef = "sqlSessionFactory")
public class DuridConfig {
	// 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "org.spring.family.springbootmybatis.dao";
    static final String MAPPER_LOCATION = "classpath:mybatis/**/*.xml";
 
    @Value("${spring.durid.datasource.url}")
    private String url;
    @Value("${spring.durid.datasource.username}")
    private String user;
    @Value("${spring.durid.datasource.password}")
    private String password;
    @Value("${spring.durid.datasource.driverClassName}")
    private String driverClass;
    
    @Value("${spring.durid.datasource.maxActive}")
    private Integer maxActive;
    @Value("${spring.durid.datasource.minIdle}")
    private Integer minIdle;
    @Value("${spring.durid.datasource.initialSize}")
    private Integer initialSize;
    @Value("${spring.durid.datasource.maxWait}")
    private Long maxWait;
    @Value("${spring.durid.datasource.timeBetweenEvictionRunsMillis}")
    private Long timeBetweenEvictionRunsMillis;
    @Value("${spring.durid.datasource.minEvictableIdleTimeMillis}")
    private Long minEvictableIdleTimeMillis;
    @Value("${spring.durid.datasource.testWhileIdle}")
    private Boolean testWhileIdle;
    @Value("${spring.durid.datasource.testWhileIdle}")
    private Boolean testOnBorrow;
    @Value("${spring.durid.datasource.testOnBorrow}")
    private Boolean testOnReturn;
 
    @Bean(name = "dataSource")
    @Primary
    public DataSource dataSource() {
    	//jdbc配置
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        
        //连接池配置
        dataSource.setMaxActive(maxActive);
        dataSource.setMinIdle(minIdle);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setValidationQuery("SELECT 'x'");
        
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        
        try {
			dataSource.setFilters("stat");
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return dataSource;
    }
 
    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
 
    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory duridSqlSessionFactory(@Qualifier("dataSource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeAliasesPackage("cn.edu.nuc.Test1.entity");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DuridConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
