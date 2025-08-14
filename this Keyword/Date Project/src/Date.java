class Date{

int day;

int month;

int year;



Date(int day,int month,int year){

this.day=day;
this.month=month;
this.year=year;

}


int getYear(){return year;}

int getMonth(){return month;}

int getDay(){return day;}


void setDay(int day){ this.day=day; }

void setMonth(int month){this.month=month;}

void setYear(int year){this.year=year;}


void setDate(int day,int month,int year){

this.day=day;
this.month=month;
this.year=year;
}

void getDate(){

System.out.println("---------------------");

System.out.println("Day :"+day);
System.out.println("Month :"+month);
System.out.println("Year :"+year);

System.out.println("---------------------");



}


}