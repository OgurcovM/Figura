package com.example.cube;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    float xPos = 60, yPos = 60, zPos = 30, sphereV, cubeV, cylinderV;
    float rad = 30, pi = 3.14f;
    @Override
    public void start(Stage primaryStage) {

        Box box = createBox();
        Cylinder cylinder = createCylinder();
        Sphere sphere = createSphere();
        Group root = new Group();
        root.getChildren().add(box);
        root.getChildren().add(cylinder);
        root.getChildren().add(sphere);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Фигуры");
        cubeV = xPos * yPos * zPos;
        cylinderV = pi * (rad * rad) * xPos;
        sphereV = (4 * pi * (rad * rad * rad))/3;
        System.out.println("Объем куба: " + cubeV);
        System.out.println("Объем цилиндра " + cylinderV);
        System.out.println("Объем сферы " + sphereV);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    Box createBox(){
        Box box = new Box();
        box.setDepth(xPos);
        box.setHeight(yPos);
        box.setWidth(zPos);
        box.setTranslateX(200);
        box.setTranslateY(200);
        box.setTranslateZ(0);
        PhongMaterial mat = new PhongMaterial();
        mat.setDiffuseColor(Color.RED);
        box.setMaterial(mat);
        Rotate xRot = new Rotate(25, Rotate.X_AXIS);
        Rotate yRot = new Rotate(20, Rotate.Y_AXIS);
        box.getTransforms().addAll(xRot, yRot);
        return box;
    }
    Cylinder createCylinder(){
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(rad);
        cylinder.setHeight(xPos);
        cylinder.setTranslateX(100);
        cylinder.setTranslateY(100);
        cylinder.setTranslateZ(0);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.BLUE);
        cylinder.setMaterial(phongMaterial);
        Rotate xRot = new Rotate(25, Rotate.X_AXIS);
        Rotate yRot = new Rotate(0, Rotate.Z_AXIS);
        cylinder.getTransforms().addAll(xRot, yRot);
        return cylinder;
    }

    Sphere createSphere(){
        Sphere sphere = new Sphere();
        sphere.setRadius(rad);
        sphere.setTranslateX(300);
        sphere.setTranslateY(300);
        sphere.setTranslateZ(0);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.RED);
        sphere.setMaterial(phongMaterial);


        return sphere;
    }
    public static void main(String[] args) {
        launch();
    }
}