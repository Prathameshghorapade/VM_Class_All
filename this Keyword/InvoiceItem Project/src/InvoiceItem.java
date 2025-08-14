class InvoiceItem{

int id;

String description;

int quantity;

double unitPrice;


InvoiceItem(int id,String description,int quantity,double unitPrice){

this.id=id;

this.description=description;

this.quantity=quantity;

this.unitPrice=unitPrice;

}


int getId(){return id;}

String getDescription(){return description;}

int getQuantity(){return quantity;}

double getUnitPrice(){return unitPrice;}



void setQuantity(int quantity){this.quantity=quantity;}

void setUnitPrice(double unitPrice){this.unitPrice=unitPrice;}

double getTotal(){ return unitPrice* quantity;}


void printInvoice(){

System.out.println("-------------------");

System.out.println("ID :"+id);

System.out.println("Description :"+description);

System.out.println("Quantity :"+quantity);

System.out.println("Unit Price :"+unitPrice);

System.out.println("Total :"+getTotal());

System.out.println("-------------------");

}

}