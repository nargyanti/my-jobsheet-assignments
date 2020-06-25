
import java.util.Scanner;

public class UMPN {

    public static void main(String[] args) {
        Scanner nil = new Scanner(System.in);
        Scanner teks = new Scanner(System.in);

        int pil1, pil2, pil3;
        double mat, fis, kim, ind, eng, akun, eko, total;
        boolean syaratTI, syaratKim, syaratSip, syaratTE, syaratMes, syaratAkun, syaratAN, syaratBahasa;
        String nama, bidang, lolos = "\nSELAMAT, ANDA RESMI MENJADI MAHASISWA BARU POLITEKNIK NEGERI MALANG JURUSAN ", prodi = " PROGRAM STUDI ";
        String UKT = "Untuk informasi mengenai daftar ulang dan pembayaran UKT mahasiswa baru Politeknik Negeri Malang 2019, kunjungi https://admisi.polinema.ac.id/pengumuman";

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                  SPMB POLINEMA - Informasi Penerimaan Mahasiswa Baru                                                       ");
        System.out.println("                                                             https://spmb.polinema.ac.id                                                                    ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t SELAMAT DATANG DI LAMAN PENGUMUMAN SB-UMPN 2019");
        System.out.println("\nSilakan isi formulir di bawah ini untuk melihat hasil seleksi SB-UMPN 2019\n");
        System.out.print("Nama: ");
        nama = teks.nextLine();
        System.out.print("Bidang yang diikuti (Rekayasa / Tata Niaga): ");
        bidang = teks.nextLine();

        if (bidang.equalsIgnoreCase("Rekayasa")) {
            System.out.println("Masukkan nilai UMPN Anda di bawah ini");
            System.out.print("- Matematika: ");
            mat = nil.nextDouble();
            if (mat >= 0 && mat <= 100) {
                System.out.print("- Fisika: ");
                fis = nil.nextDouble();
                if (fis >= 0 && fis <= 100) {
                    System.out.print("- Kimia: ");
                    kim = nil.nextDouble();
                    if (kim >= 0 && kim <= 100) {
                        System.out.print("- Bahasa Indonesia: ");
                        ind = nil.nextDouble();
                        if (ind >= 0 && ind <= 100) {
                            System.out.print("- Bahasa Inggris: ");
                            eng = nil.nextDouble();
                            if (eng >= 0 && eng <= 100) {
                                System.out.println("Pilih jurusan di bidang rekayasa yang Anda minati (isi dengan angka): ");
                                System.out.println("(1. TEKNOLOGI INFORMASI | 2. TEKNIK ELEKTRO | 3. TEKNIK KIMIA | 4. TEKNIK MESIN | 5. TEKNIK SIPIL)");
                                System.out.print("- Pilihan 1 : ");
                                pil1 = nil.nextInt();
                                if (pil1 >= 1 && pil1 <= 5) {
                                    System.out.print("- Pilihan 2 : ");
                                    pil2 = nil.nextInt();
                                    if (pil2 >= 1 && pil2 <= 5) {
                                        System.out.print("- Pilihan 3 : ");
                                        pil3 = nil.nextInt();
                                        if (pil3 >= 1 && pil3 <= 5) {
                                            total = (mat + fis + kim + ind + eng) / 5;
                                            syaratTI = mat >= 85 && fis >= 78;
                                            syaratTE = mat >= 78 && fis >= 80;
                                            syaratKim = fis >= 78 && kim >= 82;
                                            syaratMes = mat >= 75 && fis >= 82;
                                            syaratSip = mat >= 78 && fis >= 83;
                                            if ((syaratTI || syaratSip || syaratKim || syaratTE || syaratMes) && total >= 80) {
                                                switch (pil1) {
                                                    case 1:
                                                        if (syaratTI) {
                                                            if (total >= 87) {
                                                                System.out.println(lolos + "TEKNOLOGI INFORMASI" + prodi + "D4 TEKNIK INFORMATIKA\n" + UKT);
                                                            } else {
                                                                System.out.println(lolos + "TEKNOLOGI INFORMASI" + prodi + "D3 MANAJEMEN INFORMATIKA\n" + UKT);
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        if (syaratTE) {
                                                            if (total >= 86) {
                                                                System.out.println(lolos + "TEKNIK ELEKTRO" + prodi + "D4 SISTEM KELISTRIKAN\n" + UKT);
                                                            } else {
                                                                System.out.println(lolos + "TEKNIK ELEKTRO" + prodi + "D3 TEKNIK LISTRIK\n" + UKT);
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        if (syaratKim) {
                                                            if (total >= 86) {
                                                                System.out.println(lolos + "TEKNIK KIMIA" + prodi + "D4 TEKNOLOGI KIMIA INDUSTRI\n" + UKT);
                                                            } else {
                                                                System.out.println(lolos + "TEKNIK KIMIA" + prodi + "D3 TEKNIK KIMIA\n" + UKT);
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        if (syaratMes) {
                                                            if (total >= 86) {
                                                                System.out.println(lolos + "TEKNIK MESIN" + prodi + "D4 TEKNIK MESIN PRODUKSI DAN PERAWATAN\n" + UKT);
                                                            } else {
                                                                System.out.println(lolos + "TEKNIK MESIN" + prodi + "D3 TEKNIK MESIN\n" + UKT);
                                                            }
                                                        }
                                                        break;
                                                    case 5:
                                                        if (syaratSip) {
                                                            if (total >= 87) {
                                                                System.out.println(lolos + "TEKNIK SIPIL" + prodi + "D4 MANAJEMEN REKAYASA KONSTRUKSI\n" + UKT);
                                                            } else {
                                                                System.out.println(lolos + "TEKNIK SIPIL" + prodi + "D3 TEKNOLOGI KONSTRUKSI JALAN, JEMBATAN, DAN BANGUNAN AIR\n" + UKT);
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        switch (pil2) {
                                                            case 1:
                                                                if (syaratTI) {
                                                                    if (total >= 87) {
                                                                        System.out.println(lolos + "TEKNOLOGI INFORMASI" + prodi + "D4 TEKNIK INFORMATIKA\n" + UKT);
                                                                    } else {
                                                                        System.out.println(lolos + "TEKNOLOGI INFORMASI" + prodi + "D3 MANAJEMEN INFORMATIKA\n" + UKT);
                                                                    }
                                                                }
                                                                break;
                                                            case 2:
                                                                if (syaratTE) {
                                                                    if (total >= 86) {
                                                                        System.out.println(lolos + "TEKNIK ELEKTRO" + prodi + "D4 SISTEM KELISTRIKAN\n" + UKT);
                                                                    } else {
                                                                        System.out.println(lolos + "TEKNIK ELEKTRO" + prodi + "D3 TEKNIK LISTRIK\n" + UKT);
                                                                    }
                                                                }
                                                                break;
                                                            case 3:
                                                                if (syaratKim) {
                                                                    if (total >= 86) {
                                                                        System.out.println(lolos + "TEKNIK KIMIA" + prodi + "D4 TEKNOLOGI KIMIA INDUSTRI\n" + UKT);
                                                                    } else {
                                                                        System.out.println(lolos + "TEKNIK KIMIA" + prodi + "D3 TEKNIK KIMIA\n" + UKT);
                                                                    }
                                                                }
                                                                break;
                                                            case 4:
                                                                if (syaratMes) {
                                                                    if (total >= 86) {
                                                                        System.out.println(lolos + "TEKNIK MESIN" + prodi + "D4 TEKNIK MESIN PRODUKSI DAN PERAWATAN\n" + UKT);
                                                                    } else {
                                                                        System.out.println(lolos + "TEKNIK MESIN" + prodi + "D3 TEKNIK MESIN\n" + UKT);
                                                                    }
                                                                }
                                                                break;
                                                            case 5:
                                                                if (syaratSip) {
                                                                    if (total >= 87) {
                                                                        System.out.println(lolos + "TEKNIK SIPIL" + prodi + "D4 MANAJEMEN REKAYASA KONSTRUKSI\n" + UKT);
                                                                    } else {
                                                                        System.out.println(lolos + "TEKNIK SIPIL" + prodi + "D3 TEKNOLOGI KONSTRUKSI JALAN, JEMBATAN, DAN BANGUNAN AIR\n" + UKT);
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                switch (pil3) {
                                                                    case 1:
                                                                        if (syaratTI) {
                                                                            if (total >= 87) {
                                                                                System.out.println(lolos + "TEKNOLOGI INFORMASI" + prodi + "D4 TEKNIK INFORMATIKA\n" + UKT);
                                                                            } else {
                                                                                System.out.println(lolos + "TEKNOLOGI INFORMASI" + prodi + "D3 MANAJEMEN INFORMATIKA\n" + UKT);
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        if (syaratTE) {
                                                                            if (total >= 86) {
                                                                                System.out.println(lolos + "TEKNIK ELEKTRO" + prodi + "D4 SISTEM KELISTRIKAN\n" + UKT);
                                                                            } else {
                                                                                System.out.println(lolos + "TEKNIK ELEKTRO" + prodi + "D3 TEKNIK LISTRIK\n" + UKT);
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        if (syaratKim) {
                                                                            if (total >= 86) {
                                                                                System.out.println(lolos + "TEKNIK KIMIA" + prodi + "D4 TEKNOLOGI KIMIA INDUSTRI\n" + UKT);
                                                                            } else {
                                                                                System.out.println(lolos + "TEKNIK KIMIA" + prodi + "D3 TEKNIK KIMIA\n" + UKT);
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 4:
                                                                        if (syaratMes) {
                                                                            if (total >= 86) {
                                                                                System.out.println(lolos + "TEKNIK MESIN" + prodi + "D4 TEKNIK MESIN PRODUKSI DAN PERAWATAN\n" + UKT);
                                                                            } else {
                                                                                System.out.println(lolos + "TEKNIK MESIN" + prodi + "D3 TEKNIK MESIN\n" + UKT);
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 5:
                                                                        if (syaratSip) {
                                                                            if (total >= 87) {
                                                                                System.out.println(lolos + "TEKNIK SIPIL" + prodi + "D4 MANAJEMEN REKAYASA KONSTRUKSI\n" + UKT);
                                                                            } else {
                                                                                System.out.println(lolos + "TEKNIK SIPIL" + prodi + "D3 TEKNOLOGI KONSTRUKSI JALAN, JEMBATAN, DAN BANGUNAN AIR\n" + UKT);
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        System.out.println("Mohon maaf, peserta atas nama " + nama + " dinyatakan TIDAK DITERIMA pada SB-UMPN 2019. \nJangan putus asa dan tetap semangat!");
                                                                        break;
                                                                }
                                                        }
                                                }
                                            } else {
                                                System.out.println("Mohon maaf, peserta atas nama " + nama + " dinyatakan TIDAK DITERIMA pada SB-UMPN 2019. \nJangan putus asa dan tetap semangat!");
                                            }
                                        } else {
                                            System.out.println("Maaf, pilihan jurusan yang Anda masukkan salah.");
                                        }
                                    } else {
                                        System.out.println("Maaf, pilihan jurusan yang Anda masukkan salah.");
                                    }
                                } else {
                                    System.out.println("Maaf, pilihan jurusan yang Anda masukkan salah.");
                                }
                            } else {
                                System.out.println("Maaf, nilai yang Anda masukkan salah.");
                            }
                        } else {
                            System.out.println("Maaf, nilai yang Anda masukkan salah.");
                        }
                    } else {
                        System.out.println("Maaf, nilai yang Anda masukkan salah.");
                    }
                } else {
                    System.out.println("Maaf, nilai yang Anda masukkan salah.");
                }
            } else {
                System.out.println("Maaf, nilai yang Anda masukkan salah.");
            }
        } else if (bidang.equalsIgnoreCase("Tata Niaga")) {
            System.out.println("Masukkan nilai UMPN Anda di bawah ini");
            System.out.print("- Matematika: ");
            mat = nil.nextDouble();
            if (mat >= 0 && mat <= 100) {
                System.out.print("- Ekonomi: ");
                eko = nil.nextDouble();
                if (eko >= 0 && eko <= 100) {
                    System.out.print("- Akuntansi: ");
                    akun = nil.nextDouble();
                    if (akun >= 0 && akun <= 100) {
                        System.out.print("- Bahasa Indonesia: ");
                        ind = nil.nextDouble();
                        if (ind >= 0 && ind <= 100) {
                            System.out.print("- Bahasa Inggris: ");
                            eng = nil.nextDouble();
                            if (eng >= 0 && eng <= 100) {
                                System.out.println("Pilih jurusan di bidang tata niaga yang Anda minati (isi dengan angka): ");
                                System.out.println("(1. AKUNTANSI | 2. ADMINISTRASI NIAGA | 3. BAHASA)");
                                System.out.print("- Pilihan 1 : ");
                                pil1 = nil.nextInt();
                                if (pil1 >= 1 && pil1 <= 3) {
                                    System.out.print("- Pilihan 2 : ");
                                    pil2 = nil.nextInt();
                                    if (pil2 >= 1 && pil2 <= 3) {
                                        total = (mat + eko + akun + ind + eng) / 5;
                                        syaratAkun = akun >= 85 && eko >= 82;
                                        syaratAN = mat >= 78 && eko >= 84;
                                        syaratBahasa = ind >= 80 && eng >= 83;
                                        if ((syaratAkun || syaratAN || syaratBahasa) && total >= 80) {
                                            switch (pil1) {
                                                case 1:
                                                    if (syaratAkun) {
                                                        if (total >= 87) {
                                                            System.out.println(lolos + "AKUNTANSI" + prodi + "D4 AKUNTANSI MANAJEMEN\n" + UKT);
                                                        } else {
                                                            System.out.println(lolos + "AKUNTANSI" + prodi + "D3 AKUNTANSI\n" + UKT);
                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    if (syaratAN) {
                                                        if (total >= 86) {
                                                            System.out.println(lolos + "ADMINISTRASI NIAGA" + prodi + "D4 MANAJEMEN PEMASARAN\n" + UKT);
                                                        } else {
                                                            System.out.println(lolos + "ADMINISTRASI NIAGA" + prodi + "D3 ADMINISTRASI BISNIS\n" + UKT);
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    if (syaratBahasa) {
                                                        if (total >= 85) {
                                                            System.out.println(lolos + "BAHASA" + prodi + "D4 BAHASA INGGRIS UNTUK KOMUNIKASI BISNIS DAN PROFESIONAL\n" + UKT);
                                                        } else {
                                                            System.out.println(lolos + "BAHASA" + prodi + "D3 BAHASA INGGRIS\n" + UKT);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    switch (pil2) {
                                                        case 1:
                                                            if (syaratAkun) {
                                                                if (total >= 87) {
                                                                    System.out.println(lolos + "AKUNTANSI" + prodi + "D4 AKUNTANSI MANAJEMEN\n" + UKT);
                                                                } else {
                                                                    System.out.println(lolos + "AKUNTANSI" + prodi + "D3 AKUNTANSI\n" + UKT);
                                                                }
                                                            }
                                                            break;
                                                        case 2:
                                                            if (syaratAN) {
                                                                if (total >= 86) {
                                                                    System.out.println(lolos + "ADMINISTRASI NIAGA" + prodi + "D4 MANAJEMEN PEMASARAN\n" + UKT);
                                                                } else {
                                                                    System.out.println(lolos + "ADMINISTRASI NIAGA" + prodi + "D3 ADMINISTRASI BISNIS\n" + UKT);
                                                                }
                                                            }
                                                            break;
                                                        case 3:
                                                            if (syaratBahasa) {
                                                                if (total >= 85) {
                                                                    System.out.println(lolos + "BAHASA" + prodi + "D4 BAHASA INGGRIS UNTUK KOMUNIKASI BISNIS DAN PROFESIONAL\n" + UKT);
                                                                } else {
                                                                    System.out.println(lolos + "BAHASA" + prodi + "D4 BAHASA INGGRIS\n" + UKT);
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            System.out.println("Mohon maaf, peserta atas nama " + nama + " dinyatakan TIDAK DITERIMA pada SB-UMPN 2019. \nJangan putus asa dan tetap semangat!");
                                                            break;
                                                    }
                                            }
                                        } else {
                                            System.out.println("Mohon maaf, peserta atas nama " + nama + " dinyatakan TIDAK DITERIMA pada SB-UMPN 2019. \nJangan putus asa dan tetap semangat!");
                                        }
                                    } else {
                                        System.out.println("Maaf, pilihan jurusan yang Anda masukkan salah.");
                                    }
                                } else {
                                    System.out.println("Maaf, pilihan jurusan yang Anda masukkan salah.");
                                }
                            } else {
                                System.out.println("Maaf, nilai yang Anda masukkan salah.");
                            }
                        } else {
                            System.out.println("Maaf, nilai yang Anda masukkan salah.");
                        }
                    } else {
                        System.out.println("Maaf, nilai yang Anda masukkan salah.");
                    }
                } else {
                    System.out.println("Maaf, nilai yang Anda masukkan salah.");
                }
            } else {
                System.out.println("Maaf, nilai yang Anda masukkan salah.");
            }
        } else {
            System.out.println("Maaf, kata kunci yang Anda masukan salah.");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
