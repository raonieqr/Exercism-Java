class RaindropConverter {

    String convert(int number) {
        String back = "";

        if (number % 3 == 0)
            back += "Pling";
        if (number % 5 == 0)
            back += "Plang";
        if (number % 7 == 0)
            back += "Plong";
        if (back == "")
            back = Integer.toString(number);
        return (back);
    }

}
