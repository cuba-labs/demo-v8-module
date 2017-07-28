package com.company.demov8;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@Theme(ValoTheme.THEME_NAME)
public class DemoV8UI extends com.vaadin.ui.UI {
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout content = new VerticalLayout();

        Label label = new Label("Demo Vaadin 8.1");
        content.addComponent(label);

        setContent(content);
    }
}