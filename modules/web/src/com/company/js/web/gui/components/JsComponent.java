package com.company.js.web.gui.components;

import com.haulmont.cuba.gui.components.Component;

public interface JsComponent extends Component {
    String NAME = "jsComponent";

    void alert(String message);
}