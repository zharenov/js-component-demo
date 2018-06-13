package com.company.js.web.gui.xml.layout.loaders;

import com.company.js.web.gui.components.JsComponent;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;

public class JsComponentLoader extends AbstractComponentLoader<JsComponent> {
    @Override
    public void createComponent() {
        resultComponent = factory.createComponent(JsComponent.class);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {
    }
}
