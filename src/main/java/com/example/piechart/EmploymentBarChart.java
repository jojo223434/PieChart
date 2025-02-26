package com.example.piechart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class EmploymentBarChart extends Application {
    @Override
    public void start(Stage stage) {
        // Definerer akserne
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Uddannelsesniveau");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Beskæftigelsesprocent");

        // Opretter søjlediagrammet
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Beskæftigede efter uddannelsesniveau i 2019");

        // Data for Tønder Kommune
        XYChart.Series<String, Number> toenderSeries = new XYChart.Series<>();
        toenderSeries.setName("Tønder Kommune");
        toenderSeries.getData().add(new XYChart.Data<>("Grundskole", 54));
        toenderSeries.getData().add(new XYChart.Data<>("Gymnasial", 71));
        toenderSeries.getData().add(new XYChart.Data<>("Erhvervsuddannelse", 81));
        toenderSeries.getData().add(new XYChart.Data<>("KVU", 77));
        toenderSeries.getData().add(new XYChart.Data<>("MVU", 81));
        toenderSeries.getData().add(new XYChart.Data<>("LVU", 81));

        // Data for Region Syddanmark
        XYChart.Series<String, Number> regionSeries = new XYChart.Series<>();
        regionSeries.setName("Region Syddanmark");
        regionSeries.getData().add(new XYChart.Data<>("Grundskole", 54));
        regionSeries.getData().add(new XYChart.Data<>("Gymnasial", 66));
        regionSeries.getData().add(new XYChart.Data<>("Erhvervsuddannelse", 81));
        regionSeries.getData().add(new XYChart.Data<>("KVU", 83));
        regionSeries.getData().add(new XYChart.Data<>("MVU", 83));
        regionSeries.getData().add(new XYChart.Data<>("LVU", 83));

        // Tilføjer data til diagrammet
        barChart.getData().addAll(toenderSeries, regionSeries);

        // Opretter scenen og viser den
        Scene scene = new Scene(barChart, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Søjlediagram over Beskæftigelse");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
