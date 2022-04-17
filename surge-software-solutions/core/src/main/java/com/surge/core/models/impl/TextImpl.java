package com.surge.core.models.impl;

import com.adobe.cq.wcm.core.components.models.Text;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = SlingHttpServletRequest.class, adapters = Text.class)
public class TextImpl implements Text {

}
