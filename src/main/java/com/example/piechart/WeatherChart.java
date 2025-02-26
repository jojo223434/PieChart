package com.example.piechart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WeatherChart extends Application {
    @Override
    public void start(Stage stage) {
        // Definerer akserne
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Dag");
        NumberAxis yAxisTemp = new NumberAxis();
        yAxisTemp.setLabel("Temperatur (°C)");

        // Opretter kurvediagrammet for temperatur
        LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxisTemp);
        lineChart.setTitle("Vejrudsigt for næste uge i Tønder");

        // Data for temperatur
        XYChart.Series<String, Number> tempSeries = new XYChart.Series<>();
        tempSeries.setName("Temperatur");
        tempSeries.getData().add(new XYChart.Data<>("Torsdag", 8));
        tempSeries.getData().add(new XYChart.Data<>("Fredag", 6));
        tempSeries.getData().add(new XYChart.Data<>("Lørdag", 5));
        tempSeries.getData().add(new XYChart.Data<>("Søndag", 7));
        tempSeries.getData().add(new XYChart.Data<>("Mandag", 9));
        tempSeries.getData().add(new XYChart.Data<>("Tirsdag", 10));

        // Tilføj serie til kurvediagrammet
        lineChart.getData().add(tempSeries);

        // Opretter scenen og viser den
        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Vejrudsigt");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
