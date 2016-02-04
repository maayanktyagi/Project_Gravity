package com.ProjectGravity;

/**
 * Created by Team Project_Gravity on 04/02/16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UI extends Application {
    Stage protonStage;
    BorderPane borderPane;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        /** Naming Stage as protonStage **/
        protonStage = primaryStage;

        /** Setting up the stage title **/
        primaryStage.setTitle("Proton");




        /** Creating Scene */

        /** Creating Top menus - File, Edit, Help, Difficulty **/

        MenuBar menuBar;

        /** Creating File Menu **/

        Menu fileMenu = new Menu("_File");

        /** Adding items in file menu **/

        MenuItem newFile, saveFile, openFile, settingsFile, exitFile;

        newFile = new MenuItem("New...");
        fileMenu.getItems().add(newFile);

        saveFile = new MenuItem("Save...");
        fileMenu.getItems().add(saveFile);

        openFile = new MenuItem("Open");
        fileMenu.getItems().add(openFile);

        settingsFile = new MenuItem("Settings");
        fileMenu.getItems().add(settingsFile);

        exitFile = new MenuItem("Exit");
        fileMenu.getItems().add(exitFile);


















        /**Creating MenuBar **/

        menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);

        /** Fixing stuff up in Border Layout **/
        borderPane = new BorderPane();
        /** Top Content **/

        borderPane.setTop(menuBar);

        /** Setting up Scene */
        Scene scene1 = new Scene(borderPane, 400, 400);
        primaryStage.setScene(scene1);

        /** Showing Scene */
        primaryStage.show();
    }
}
