package com.vaadin.flow.ganttapidemo;

import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class DemoCard extends VerticalLayout {

    public DemoCard() {
        setSpacing(false);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        add(new H4(this.getClass().getName()));
        getStyle().set("padding-bottom", "5rem");
    }
}
