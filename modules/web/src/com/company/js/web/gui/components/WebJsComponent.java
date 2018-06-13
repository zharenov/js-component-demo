package com.company.js.web.gui.components;

import com.haulmont.cuba.web.gui.components.WebAbstractComponent;

public class WebJsComponent extends WebAbstractComponent<com.company.js.web.toolkit.ui.sampleserverjscomponent.SampleServerJsComponent> implements JsComponent {
    public WebJsComponent() {
        this.component = new com.company.js.web.toolkit.ui.sampleserverjscomponent.SampleServerJsComponent();
    }

    @Override
    public void alert(String message) {
        component.alert(message);
    }
}