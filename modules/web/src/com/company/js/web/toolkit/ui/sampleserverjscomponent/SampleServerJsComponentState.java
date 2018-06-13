package com.company.js.web.toolkit.ui.sampleserverjscomponent;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class SampleServerJsComponentState extends JavaScriptComponentState {

    protected String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
