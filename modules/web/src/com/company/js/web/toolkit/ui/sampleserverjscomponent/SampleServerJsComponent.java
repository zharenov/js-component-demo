package com.company.js.web.toolkit.ui.sampleserverjscomponent;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;

@JavaScript({"sampleserverjscomponent-connector.js"})
public class SampleServerJsComponent extends AbstractJavaScriptComponent {
    public SampleServerJsComponent() {
    }

    @Override
    protected SampleServerJsComponentState getState() {
        return (SampleServerJsComponentState) super.getState();
    }

    public void alert(String message) {
        getState().setMessage(message);
    }
}