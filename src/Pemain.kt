class Pemain(Player1:String, Player2:String) {
    var namaPlayer1: String
    var namaPlayer2: String
    init {
        namaPlayer1 = Player1
        namaPlayer2 = Player2
        setNamaPemain(namaPlayer1)
    }
    fun setNamaPemain(nama:String):String{
        return namaPlayer1

    }
}