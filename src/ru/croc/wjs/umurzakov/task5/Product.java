package ru.croc.wjs.umurzakov.task5;


public abstract class Product {
    private double price;
    private String description;
    private Countries country;
    private double length;
    private double width;
    private double height;
    private double weight;
    private int power;
    private boolean warranty;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Невозможно присвоить значение price!");
        } else {
            this.price = price;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Невозможно присвоить значение length!");
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Невозможно присвоить значение width!");
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.err.println("Невозможно присвоить значение height!");
        } else {
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            System.err.println("Невозможно присвоить значение weight!");
        } else {
            this.weight = weight;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power <= 0) {
            System.err.println("Невозможно присвоить значение power!");
        } else {
            this.power = power;
        }
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public boolean isImport() {
        if (country != Countries.RUSSIA) {
            return true;
        } else {
            return false;
        }
    }

    public void setWarranty(boolean warranty) {
        if (isImport()) {
            this.warranty = warranty;
        } else {
            System.err.println("Товар отечественный.");
        }
    }

    //В моем случае страну производства и гарантию (по дефолту false) можно получить и для неимпортного товара.
    public Countries getCountry() {
        return country;
    }

    public boolean hasWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return "Характеристики товара:\n"
                + "Опиcание: " + description + "\n"
                + (isImport() ? ("Страна производства: " + country + "\n") : "") // Страна и гарантия выводятся
                + "Цена: " + price + "\n"                                        // только для импортных
                + (isImport() ? ("Гарантия: " + warranty + "\n") : "")
                + "Вес: " + weight + "\n"
                + "Размер: " + length + " X " + width + " X " + height + "\n"
                + "Потребляемая мощность: " + power + "W\n";
    }

}
