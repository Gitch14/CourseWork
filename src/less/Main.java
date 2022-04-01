package less;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



class Client {
    public static void AddList(User user) {
        clientList.add(user);
    }



    static class User {
        public int key_client;
        public String name;
        public String phone;
        public String passport_id;
        public int skidka;


        public User(int key_client, String name, String phone, String passport_id, int skidka) {
            this.key_client = key_client;
            this.name = name;
            this.phone = phone;
            this.passport_id = passport_id;
            this.skidka = skidka;
        }

        @Override
        public String toString() {
            return "User{" +
                    "key_client=" + key_client +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", passport_id='" + passport_id + '\'' +
                    ", skidka=" + skidka +
                    '}';
        }
    }


    static ArrayList<Object> clientList = new ArrayList<>();

    public void AddList(int key_client, String name, String phone_number, String passport_id, int skidka) {
        clientList.add(new User(key_client,name,phone_number,passport_id,skidka));
    }
} // class Client end


class CityInfo {
    public static void AddList(City city) {
        cityList.add(city);
    }



    static class City {
        public int id_City;
        public String name_place;
        public String country;



        public City(int id_City, String name_place, String country) {
            this.id_City = id_City;
            this.name_place = name_place;
            this.country = country;
        }

        @Override
        public String toString() {
            return "City{" +
                    "id_City=" + id_City +
                    ", name_place='" + name_place + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }


    static ArrayList<Object> cityList = new ArrayList<>();

    public void AddList(int id_City, String name_place, String country) {
        cityList.add(new City(id_City,name_place,country));
    }
}// class city info end

class VoucherInfo {
    public static void AddVoucher(Voucher voucher) {
        voucherList.add(voucher);
    }



    static class Voucher {
        public int id_Voucher;
        public String Name;
        public Date date_start;
        public Date date_end;
        public int id_City_voucher;
        public String services;
        public int price;
        public int count;


        public Voucher(int id_Voucher, String name, Date date_start, Date date_end, int id_City_voucher, String services, int price, int count) {
            this.id_Voucher = id_Voucher;
            Name = name;
            this.date_start = date_start;
            this.date_end = date_end;
            this.id_City_voucher = id_City_voucher;
            this.services = services;
            this.price = price;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Voucher{" +
                    "id_Voucher=" + id_Voucher +
                    ", Name='" + Name + '\'' +
                    ", date_start='" + date_start + '\'' +
                    ", date_end='" + date_end + '\'' +
                    ", id_City_voucher=" + id_City_voucher +
                    ", services='" + services + '\'' +
                    ", price=" + price +
                    ", count=" + count +
                    '}';
        }
    }


    static ArrayList<Object> voucherList = new ArrayList<>();

    public void AddVoucher(int id_Voucher, String name, Date date_start, Date date_end, int id_City_voucher, String services, int price, int count) {
        voucherList.add(new Voucher(id_Voucher, name,date_start, date_end, id_City_voucher, services, price, count));
    }
}// Voucher class end


class SaleInfo {
    public static void AddList(Sale sale) {
        saleList.add(sale);
    }



    static class Sale {
        public int id_Sale;
        public String Name;
        public Date date_Sale;


        public Sale(int id_Sale, String name, Date date_Sale) {
            this.id_Sale = id_Sale;
            Name = name;
            this.date_Sale = date_Sale;
        }

        @Override
        public String toString() {
            return "Sale{" +
                    "id_Sale=" + id_Sale +
                    ", Name='" + Name + '\'' +
                    ", date_Sale=" + date_Sale +
                    '}';
        }
    }


    static ArrayList<Object> saleList = new ArrayList<>();

    public static void AddSale(int id_Sale, String name, Date date_Sale) {
        saleList.add(new Sale(id_Sale, name, date_Sale));
    }
}


public class Main {

    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("d MMMM yyyy", new Locale("ru"));
        Scanner scanner = new Scanner(System.in);
        int key_Client = 0, id_City = 0, id_Voucher = 0, id_Sale = 0;
        boolean b = true;

        do {
            key_Client++;
            System.out.println("Введите имя клиента, номер телефона, номер паспорта и скидку разделяйте их двумя пробелами");
            String prodStr1 = scanner.nextLine();
            String[] client = prodStr1.split("  ");
            Client.AddList(new Client.User(key_Client,client[0], client[1], client[2], Integer.parseInt(client[3].trim())));


            id_City++;
            System.out.println("Введите название города, и страну разделяйте их двумя пробелами");
            String prodStr2 = scanner.nextLine();
            String[] city = prodStr2.split("  ");
            CityInfo.AddList(new CityInfo.City(id_City, city[0], city[1]));


            id_Voucher++;
            System.out.println("Введите название путевки, дата начало, дата конца, город ключ, услуги, ценна и количество человек скидку разделяйте их двумя пробелами");
            String prodStr3 = scanner.nextLine();
            String[] voucher = prodStr3.split("  ");
            VoucherInfo.AddVoucher(new VoucherInfo.Voucher(id_Voucher,voucher[0], format.parse(voucher[1]), format.parse(voucher[2]), Integer.parseInt(voucher[3].trim()), voucher[4], Integer.parseInt(voucher[5].trim()),Integer.parseInt(voucher[6].trim())));


            System.out.println("Введите ФИО сотрудника и дата продажы разделяйте их двумя пробелами");
            id_Sale++;
            String prodStr4 = scanner.nextLine();
            String[] sale = prodStr4.split("  ");
            SaleInfo.AddList(new SaleInfo.Sale(id_City, sale[0], format.parse(sale[1])));


            System.out.println("Введите Y или y для продолжения");
            String check = scanner.nextLine();
            if (check.contains("Y") || check.contains("y")) {
                b = true;
            } else {
                b = false;
            }
        } while (b == true);


        for(Object s1 : Client.clientList) {
            System.out.println(s1);
        }

        for(Object s2 : CityInfo.cityList) {
            System.out.println(s2);
        }

        for(Object s3 : VoucherInfo.voucherList) {
            System.out.println(s3);
        }

        for(Object s4 : SaleInfo.saleList) {
            System.out.println(s4);
        }
//
     //
    }
}
