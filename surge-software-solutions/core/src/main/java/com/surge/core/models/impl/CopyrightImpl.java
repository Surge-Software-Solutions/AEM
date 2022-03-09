package com.surge.core.models.impl;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// import javax.inject.Inject;

import com.surge.core.models.Copyright;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, adapters = Copyright.class)
public class CopyrightImpl implements Copyright {

    @ValueMapValue
    private List<String> policyLinkText;

    @ValueMapValue
    private List<String> policySubLinkUrl;

    @ValueMapValue
    private String copyrightText;

    @Override
    public List<Map<String, String>> getPolicyLinks() {

        if (policyLinkText != null) {
            List<Map<String, String>> policy = new ArrayList<>();
            for (int i = 0; i < policyLinkText.size(); i++) {
                Map<String, String> result = new HashMap<>();
                result.put("linkText", policyLinkText.get(i));
                result.put("linkUrl", policySubLinkUrl.get(i));
                policy.add(result);
            }
            return policy;
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public String getCopyrightText() {

        return copyrightText;
    }

}
