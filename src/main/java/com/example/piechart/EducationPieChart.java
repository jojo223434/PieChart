package com.example.piechart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class EducationPieChart extends Application {
    @Override
    public void start(Stage stage) {
        // Opretter data til cirkeldiagrammet
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Grundskole", 25),
                new PieChart.Data("Gymnasial", 4),
                new PieChart.Data("Erhvervsuddannelse", 46),
                new PieChart.Data("KVU", 5),
                new PieChart.Data("MVU", 14),
                new PieChart.Data("LVU", 5)
        );

        // Opretter cirkeldiagrammet med data
        PieChart pieChart = new PieChart(pieChartData);
        pieChart.setTitle("Uddannelsesniveau i Tønder Kommune");

        // Opretter scenen og viser den
        Scene scene = new Scene(pieChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Cirkeldiagram over Uddannelsesniveau");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
