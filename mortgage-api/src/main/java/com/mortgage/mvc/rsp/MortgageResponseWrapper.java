package com.mortgage.mvc.rsp;

import com.base.web.response.wrapper.WrapperResponseScanPackages;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

/**
 * @author suyh
 * @since 2025-12-20
 */
@Component
public class MortgageResponseWrapper implements WrapperResponseScanPackages {
    @Override
    public Collection<String> getScanPackages() {
        return Collections.singletonList("com.mortgage.business.controller");
    }
}
