package com.lambdaschool.shoppingcart.config;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import java.io.IOException;
import java.util.logging.Filter;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleCorsFilter implements Filter
{
    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain)
        throws
            IOException,
            ServletException
    {
        

    }
    )
}
