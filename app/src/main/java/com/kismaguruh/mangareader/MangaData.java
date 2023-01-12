package com.kismaguruh.mangareader;

import java.util.ArrayList;

public class MangaData {
    private static String[] manganame = {
            "One Piece",
            "Black Clover",
            "one Punch Man",
            "Maou Gakuin no Futekigousha",
            "Naruto Shippuden",
    };

    private static String[] mangagenre = {
            "Aksi, Petualangan, Fantasi",
            "Petualangan, fantasi",
            "Laga, Komedi, Komik pahlawan super",
            " Action, Fantasy",
            "Aksi , Petualangan , Fantasi",
    };

    private static String[] mangaauthor = {
            "Eiichiro Oda",
            "Yuki Tabata",
            "One , Yusuke Murata",
            "Shu",
            "Masashi Kishimoto",
    };

    private static String[] mangasinopsis = {
            "Gol D. Roger dikenal sebagai \"Raja Bajak Laut\", makhluk terkuat dan paling terkenal yang pernah mengarungi Grand Line. Penangkapan dan eksekusi Roger oleh Pemerintah Dunia membawa perubahan di seluruh dunia. Kata-kata terakhirnya sebelum kematiannya mengungkapkan keberadaan harta karun terbesar di dunia, One Piece. Pengungkapan inilah yang membawa Zaman Keagungan Bajak Laut, orang-orang yang bermimpi menemukan One Piece—yang menjanjikan kekayaan dan ketenaran yang tak terbatas—dan sangat mungkin puncak kejayaan dan gelar Raja Bajak Laut.\n" +
                    "\n" +
                    "Masukkan Monkey D. Luffy, seorang bocah lelaki berusia 17 tahun yang menentang definisi standar Anda tentang bajak laut. Alih-alih persona populer bajak laut yang jahat, keras, dan ompong yang mengobrak-abrik desa untuk bersenang-senang, alasan Luffy menjadi bajak laut adalah salah satu keajaiban murni: pemikiran tentang petualangan menarik yang membawanya ke orang-orang yang menarik dan akhirnya, harta yang dijanjikan. Mengikuti jejak pahlawan masa kecilnya, Luffy dan krunya melakukan perjalanan melintasi Grand Line, mengalami petualangan gila, mengungkap misteri gelap dan melawan musuh yang kuat, semuanya untuk mencapai kekayaan yang paling didambakan—One Piece.",
            "Asta dan Yuno ditinggalkan di gereja yang sama pada hari yang sama. Dibesarkan bersama sebagai anak-anak, mereka mengetahui tentang \"Raja Penyihir\"—gelar yang diberikan kepada penyihir terkuat di kerajaan—dan berjanji bahwa mereka akan bersaing satu sama lain untuk memperebutkan posisi Raja Penyihir berikutnya. Namun, saat mereka tumbuh dewasa, perbedaan mencolok di antara mereka menjadi jelas. Sementara Yuno mampu menggunakan sihir dengan kekuatan dan kontrol yang luar biasa, Asta tidak dapat menggunakan sihir sama sekali dan berusaha mati-matian untuk membangkitkan kekuatannya dengan berlatih secara fisik.\n" +
                    "\n" +
                    "Saat mereka mencapai usia 15 tahun, Yuno dianugerahi Grimoire yang spektakuler dengan semanggi berdaun empat, sementara Asta tidak menerima apa pun. Namun, segera setelah itu, Yuno diserang oleh seseorang bernama Lebuty, yang tujuan utamanya adalah untuk mendapatkan Grimoire milik Yuno. Asta mencoba melawan Lebuty, tetapi dia kalah. Meski tanpa harapan dan di ambang kekalahan, dia menemukan kekuatan untuk melanjutkan saat mendengar suara Yuno. Melepaskan emosi batinnya dalam kemarahan, Asta menerima Grimoire semanggi berdaun lima, \"Semanggi Hitam\" yang memberinya kekuatan yang cukup untuk mengalahkan Lebuty. Beberapa hari kemudian, kedua sahabat itu pergi ke dunia luar, keduanya mencari tujuan yang sama—menjadi Raja Penyihir!",
            "Saitama yang tampaknya tidak mengesankan memiliki hobi yang agak unik: menjadi pahlawan. Untuk mengejar impian masa kecilnya, Saitama berlatih tanpa henti selama tiga tahun, kehilangan semua rambutnya dalam prosesnya. Sekarang, Saitama sangat kuat, dia bisa mengalahkan musuh apapun hanya dengan satu pukulan. Namun, karena tidak ada orang yang mampu menandingi kekuatannya telah membawa Saitama ke masalah yang tidak terduga—dia tidak lagi dapat menikmati serunya pertarungan dan menjadi sangat bosan.\n" +
                    "\n" +
                    "Suatu hari, Saitama menarik perhatian Genos cyborg berusia 19 tahun, yang menyaksikan kekuatannya dan ingin menjadi murid Saitama. Genos mengusulkan agar keduanya bergabung dengan Asosiasi Pahlawan untuk menjadi pahlawan bersertifikat yang akan diakui atas kontribusi positif mereka kepada masyarakat. Saitama, yang kaget karena tidak ada yang tahu siapa dia, dengan cepat setuju. Bertemu sekutu baru dan menghadapi musuh baru, Saitama memulai perjalanan baru sebagai anggota Asosiasi Pahlawan untuk merasakan keseruan pertempuran yang pernah ia rasakan.",
            "Di masa lalu yang jauh, perang antara manusia dan iblis menyebabkan kekacauan dan pertumpahan darah yang meluas. Untuk mengakhiri konflik yang tampaknya tak berujung ini, Raja Iblis Anos Voldigoad dengan rela mengorbankan hidupnya, berharap untuk dilahirkan kembali di masa depan yang damai.\n" +
                    "\n" +
                    "Sebagai persiapan untuk kembalinya raja mereka, ras iblis menciptakan Akademi Raja Iblis, sebuah institusi elit yang bertugas menentukan identitas Anos saat dia bangkit kembali. Dia bereinkarnasi dua milenium kemudian, tetapi yang mengejutkan, dia segera mengetahui bahwa tingkat sihir di dunia telah berkurang secara drastis selama ketidakhadirannya. Terlebih lagi, ketika dia mendaftar di akademi untuk merebut kembali gelarnya yang sah, dia mengetahui bahwa iblis mengingatnya secara berbeda. Kepribadiannya, perbuatannya, dan bahkan warisannya semuanya dipalsukan—bertopeng di bawah nama seorang penipu. \"Kurangnya\" pengetahuan umum ini membuatnya menjadi outlier akademi — ketidaksesuaian yang belum pernah terlihat dalam sejarah.\n" +
                    "\n" +
                    "Terlepas dari kekurangan ini, Anos tetap tidak terpengaruh. Saat dia berusaha mengungkap orang-orang yang mengubah masa lalunya yang gemilang, dia melakukannya sendiri untuk membuat keturunannya menyadari bahwa penguasa mereka akhirnya telah kembali.",
            "Sudah dua setengah tahun sejak Naruto Uzumaki meninggalkan Konohagakure, Desa Daun Tersembunyi, untuk latihan intensif mengikuti peristiwa yang memicu keinginannya untuk menjadi lebih kuat. Sekarang Akatsuki, organisasi misterius ninja nakal elit, mendekati rencana besar mereka yang dapat mengancam keselamatan seluruh dunia shinobi.\n" +
                    "\n" +
                    "Meskipun Naruto lebih tua dan kejadian menyeramkan tampak di cakrawala, dia telah berubah sedikit dalam kepribadian — masih kasar dan kekanak-kanakan — meskipun dia sekarang jauh lebih percaya diri dan memiliki tekad yang lebih besar untuk melindungi teman dan rumahnya. Apa pun yang terjadi, Naruto akan melanjutkan perjuangan untuk apa yang penting baginya, bahkan dengan mengorbankan tubuhnya sendiri, dalam kelanjutan saga tentang anak laki-laki yang ingin menjadi Hokage.",
    };

    private static int[] mangagambar = {
            R.drawable.onepiece,
            R.drawable.blackclover,
            R.drawable.onepunchman,
            R.drawable.maougakuin,
            R.drawable.naruto,
    };

    public static ArrayList<MangaEntity>getListManga(){
        ArrayList<MangaEntity>list = new ArrayList<>();
        for (int position = 0; position < manganame.length; position++){
            MangaEntity mangaEntity = new MangaEntity();
            mangaEntity.setName(manganame[position]);
            mangaEntity.setMangagenre(mangagenre[position]);
            mangaEntity.setMangaauthor(mangaauthor[position]);
            mangaEntity.setMangasinopsis(mangasinopsis[position]);
            mangaEntity.setMangagambar(mangagambar[position]);
            list.add(mangaEntity);
        }
        return list;
    }










}