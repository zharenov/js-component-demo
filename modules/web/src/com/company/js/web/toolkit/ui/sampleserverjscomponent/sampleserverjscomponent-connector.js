com_company_js_web_toolkit_ui_sampleserverjscomponent_SampleServerJsComponent = function() {

    var connector = this;
    var element = connector.getElement();


    connector.onStateChange = function() {
        var state = connector.getState();
        if (state.message == null) {
            return;
        }
        alert(state.message)
    }
}