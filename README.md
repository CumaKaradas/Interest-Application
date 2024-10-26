# Basit Faiz Uygulaması

Bu proje, Java dilinde yazılmış bir basit faiz hesaplama uygulamasıdır. Kullanıcıdan alınan anapara, yıllık faiz oranı ve vade süresi bilgilerine göre faiz tutarını ve toplam geri ödeme tutarını hesaplar.

## Özellikler

- **Faiz Tutarı Hesaplama:** Kullanıcının girdiği anapara, yıllık faiz oranı ve vade süresine göre faiz tutarını hesaplar.
- **Toplam Tutar Hesaplama:** Hesaplanan faiz tutarını anaparaya ekleyerek toplam geri ödeme tutarını bulur.

## Gereksinimler

- **Java 8** veya daha yeni bir sürüm

## Kurulum

1. Projeyi bilgisayarınıza klonlayın veya `FaizUygulamasi.java` dosyasını indirin.
2. Terminalde Java dosyasını derlemek için:

    ```bash
    javac FaizUygulamasi.java
    ```

3. Uygulamayı çalıştırmak için:

    ```bash
    java FaizUygulamasi
    ```

## Kullanım

1. Uygulama çalıştırıldığında sırasıyla aşağıdaki bilgileri girin:
   - **Ana Para:** Yatırımın başlangıç miktarını girin.
   - **Faiz Oranı (%):** Yıllık faiz oranını yüzde cinsinden girin.
   - **Vade (yıl):** Vade süresini yıl cinsinden girin.

2. Girilen verilere göre uygulama, faiz tutarını ve toplam geri ödeme tutarını ekranda gösterir.

## Kod Hakkında

- **Faiz Hesaplama Formülü:** `(anaPara * faizOrani * vade) / 100` formülüyle basit faiz hesaplanmaktadır.
- **Toplam Tutar:** Anapara ile faiz tutarı toplanarak geri ödeme için gereken toplam miktar bulunur.

## Katkıda Bulunma

Bu proje geliştirmeye açıktır. Katkıda bulunmak için:
1. Projeyi çatallayın.
2. Değişikliklerinizi yapın.
3. Bir çekme isteği gönderin.

## Lisans

Bu proje açık kaynak bir projedir ve herhangi bir lisans altında yayınlanmamıştır.
