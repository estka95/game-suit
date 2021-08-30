fun Validasi(inputan:String):Boolean{
    return if (inputan.uppercase() !="GUNTING" && inputan.uppercase() !="KERTAS" && inputan.uppercase() !="BATU") {
        false
    } else {
        true
    }
}