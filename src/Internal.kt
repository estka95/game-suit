fun main (args:Array<String>){
    lateinit var tangan1: String
    lateinit var tangan2: String

//munculkan header permainan suit
    println("*************************************")
    println("Permainan Suit Batu-Gunting-Kertas!!!")
    println("*************************************")

//kasih nama pemain
    println("Masukkan nama Player 1:")
    val namaPlayer1:String = readLine().toString().uppercase()
    var player1 = Pemain(namaPlayer1)
    println("Masukkan nama Player 2:")
    val namaPlayer2:String = readLine().toString().uppercase()
    var player2 = Pemain(namaPlayer2)

//munculkan pilihan tangan pemain
        player1.input()
        player2.input()

    InputTangan(player1.nilai, player2.nilai, player1.nama, player2.nama)


}

