package com.monvoyage;

import javax.sql.DataSource;

import org.hibernate.boot.model.relational.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
	
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.msql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/MonVoyageApplication");
		dataSource.setUsername("root");
		dataSource.setPassword("32879142");
		return dataSource;
		
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySqlDialect");
		adapter.setPrepareConnection(true);
		return adapter;
	}
}
