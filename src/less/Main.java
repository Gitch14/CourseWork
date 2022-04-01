package less;

import java.util.ArrayList;
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
        public String date_start;
        public String date_end;
        public int id_City_voucher;
        public String services;
        public int price;
        public int count;


        public Voucher(int id_Voucher, String name, String date_start, String date_end, int id_City_voucher, String services, int price, int count) {
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

    public void AddVoucher(int id_Voucher, String name, String date_start, String date_end, int id_City_voucher, String services, int price, int count) {
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
        public int date_Sale;


        public Sale(int id_Sale, String name, int date_Sale) {
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

    public static void AddSale(int id_Sale, String name, int date_Sale) {
        saleList.add(new Sale(id_Sale, name, date_Sale));
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key_Client = 0, id_City = 0, id_Voucher = 0, id_Sale = 0;
        boolean b = true;

        do {
            key_Client++;
            System.out.println("Проверка");
            String verf = scanner.nextLine();
            System.out.println("Введите имя клиента");
            String name = scanner.nextLine();
            System.out.println("Введите мобильный клиента");
            String phone_number = scanner.nextLine();
            System.out.println("Введите номер паспорта клиента");
            String passport_ID = scanner.nextLine();
            System.out.println("Введите скидку для клиента");
            int skidka = scanner.nextInt();

            System.out.println("Введите 1 для продолжения");
            int checknum = scanner.nextInt();
            if (checknum == 1) {
                b = true;
            } else {
                b = false;
            }
            Client.AddList(new Client.User(key_Client,name,phone_number,passport_ID,skidka));
        } while (b == true);


        do {
            id_City++;
            System.out.println("Проверка");
            String verf = scanner.nextLine();
            System.out.println("Введите название путевки");
            String name_place = scanner.nextLine();
            System.out.println("Введите страну");
            String country = scanner.nextLine();


            System.out.println("Введите 1 для продолжения");
            int checknum = scanner.nextInt();
            if (checknum == 1) {
                b = true;
            } else {
                b = false;
            }
            CityInfo.AddList(new CityInfo.City(id_City,name_place,country));
        } while (b == true);

        do {
            id_Voucher++;
            System.out.println("Проверка");
            String verf = scanner.nextLine();
            System.out.println("Введите название путевки");
            String name = scanner.nextLine();
            System.out.println("Введите начало поездки");
            String date_start = scanner.nextLine();
            System.out.println("Введите конец поездки");
            String date_end = scanner.nextLine();
            System.out.println("Введите город(key int)"); // ключ
            int id_City_voucher = scanner.nextInt();
            System.out.println("Введите услугу");
            String services = scanner.nextLine();
            System.out.println("Введите цену на услугу");
            int price = scanner.nextInt();
            System.out.println("Введите количество людей");
            int count = scanner.nextInt();

            System.out.println("Введите 1 для продолжения");
            int checknum = scanner.nextInt();
            if (checknum == 1) {
                b = true;
            } else {
                b = false;
            }
            VoucherInfo.AddVoucher(new VoucherInfo.Voucher(id_Voucher, name,date_start, date_end, id_City_voucher, services, price, count));
        } while (b == true);


        do {
            id_Sale++;
            System.out.println("Проверка");
            String verf = scanner.nextLine();
            System.out.println("Введите название путевки");
            String name = scanner.nextLine();
            System.out.println("Дата продажи");
            int date_Sale = scanner.nextInt();


            System.out.println("Введите 1 для продолжения");
            int checknum = scanner.nextInt();
            if (checknum == 1) {
                b = true;
            } else {
                b = false;
            }
            SaleInfo.AddList(new SaleInfo.Sale(id_Sale, name,date_Sale));
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





    }

}
