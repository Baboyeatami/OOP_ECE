/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author Jamie Eduardo Rosal <Jamiewertalmighty@gmail.com>
 */
public class Car {

    private int No_of_wheels;
    private int Car_type; //1=diesel 2=Gas 3=electric
    private String Color;
    private int No_of_Pasengers;
    private String Brand;
    private double horsepower;

    public static String Registration;

    //mao ni ang Constructor haha
    public Car() {
    }

    public Car(int Wheels, int CarType, int horsepower) {
        this.No_of_wheels = Wheels;
        this.Car_type = CarType;
        this.horsepower = horsepower;

    }

    void RunCar() {
        double Pace = (No_of_wheels * getHorsepower()) / 3;

        System.out.println("Car is Running @ " + Pace + " km/hr");
    }

    private int get_NOofWheels() {
        return this.No_of_wheels;
    }

    private void Set_tNOofWheels(int Wheels) {
        this.No_of_wheels = Wheels;
    }

    /**
     * @return the Car_type
     */
    public int getCar_type() {
        return Car_type;
    }

    /**
     * @param Car_type the Car_type to set
     */
    public void setCar_type(int Car_type) {
        this.Car_type = Car_type;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the No_of_Pasengers
     */
    public int getNo_of_Pasengers() {
        return No_of_Pasengers;
    }

    /**
     * @param No_of_Pasengers the No_of_Pasengers to set
     */
    public void setNo_of_Pasengers(int No_of_Pasengers) {
        this.No_of_Pasengers = No_of_Pasengers;
    }

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the horsepower
     */
    public double getHorsepower() {
        return horsepower;
    }

    /**
     * @param horsepower the horsepower to set
     */
    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

}
