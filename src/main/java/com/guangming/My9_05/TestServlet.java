package com.guangming.My9_05;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by cgm on 2017/9/5.
 */
@WebServlet(name = "testservlet", urlPatterns="/testServlet",loadOnStartup=1)
public class TestServlet implements Servlet {
    private transient ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        return this.servletConfig.getServletName();
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
