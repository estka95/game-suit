fun main (args:Array<String>){

//munculkan header permainan suit
    println("*************************************")
    println("Permainan Suit Batu-Gunting-Kertas!!!")
    println("*************************************")

//kasih nama pemain
    println("Masukkan nama Player 1:")
    val namaPlayer1:String = readLine().toString().uppercase()
    println("Masukkan nama Player 2:")
    val namaPlayer2:String = readLine().toString().uppercase()


//munculkan pilihan tangan pemain
    println("Masukkan pilihan tanganmu,")

    //input tangan player 1
    println("${namaPlayer1} mengeluarkan:")
    val tangan1:String = readLine().toString().lowercase()

    //input tangan player 2
    println("${namaPlayer2} mengeluarkan: ")
    val tangan2:String = readLine().toString().lowercase()

    InputTangan(tangan1,tangan2,namaPlayer1,namaPlayer2)
//hasil

}

