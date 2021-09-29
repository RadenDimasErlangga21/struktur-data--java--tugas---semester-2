
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class tugas1_prisma {
    int luasAlas;
    int kelilingAlas;
    int tinggiPrisma;
    
public int hitungLuasPrisma() {
    int luas = 2 * luasAlas * kelilingAlas;
    return luas;
}
public int hitungVolumePrisma() {
    int volume = luasAlas * tinggiPrisma;
    return volume;
}
}
