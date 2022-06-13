fun main(){
    var amount: Int = 1500_00 //Сумма покупки
    val customer = true //признак постоянного клиента
    val discountStart100 = 1001_00 //начальная гарница примеенения скидки 100р
    val discount100 = 100_00 //значние скидки 100р
    val discountStart5 = 10001_00 //начальная гарница примеенения скидки 5%
    val discount5 = 0.05 //значние скидки 5%
    val discountCustomer = 0.01 //значние скидки постоянного покупателя
    var discount: Int  = 0 //сумма скидки
    if (amount >= discountStart5) {
        discount = (amount * discount5).toInt()
    } else if (amount >= discountStart100) {
        discount = discount100
    }
    amount -= discount
    if (customer)  {
        discount += (amount * discountCustomer).toInt()
    }
    println("Скидка составила " + discount/100 + " руб. " + discount%100 + " коп.")
}