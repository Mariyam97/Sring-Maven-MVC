package com.gl.dispatcher;



	import org.springframework.web.context.WebApplicationContext;
	import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
	import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import com.gl.config.MyConfiguration;



	public class  MyInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() {
			
			return new Class[0];
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			// TODO Auto-generated method stub
			return new Class[] {MyConfiguration.class};
		}

		@Override
		protected String[] getServletMappings() {
			// TODO Auto-generated method stub
			return new String[] {"/"};
		}
}
