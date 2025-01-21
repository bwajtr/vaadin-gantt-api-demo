package com.vaadin.flow.ganttapidemo;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.ganttapidemo.examples.*;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Gantt Api Demonstration")
@Route("")
public class GanttApiDemonstrationView extends VerticalLayout {

    public GanttApiDemonstrationView() {
        add(new H2("Gantt Api Demonstration"));

        VerticalLayout charts = new VerticalLayout();
        charts.setMaxWidth("1000px");

        charts.add(new GanttCustomDataLabels());
        charts.add(new GanttCustomXAxis());
        charts.add(new GanttInteractiveDemo());
        charts.add(new GanttLeftAxisAsTable());
        charts.add(new GanttProcessManagement());
        charts.add(new GanttProgressIndicator());
        charts.add(new GanttResourceManagement());
        charts.add(new GanttWithNavigation());

        add(charts);

        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
