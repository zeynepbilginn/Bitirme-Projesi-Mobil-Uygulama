# FitStorm Mobil Uygulaması
## Tanıtım 
<img src="/img/FitStorm%20Tan%C4%B1t%C4%B1m%20Ekran.png" alt="alt text" width="960" height="470">

FitStorm, kilo vermek, kilo almak veya kiloyu korumak isteyen kullanıcılara yönelik bir mobil uygulamadır. Kullanıcılar, beslenme hedeflerini belirlemek ve tercih ettikleri makro besin oranlarını ve diyet kısıtlamalarını ayarlamak suretiyle FitStorm'u kullanmaya başlarlar. Uygulama, kullanıcıların bireysel hedeflerine ve tercihlerine dayalı olarak kişiye özel bir beslenme planı sunar ve sağlıklı yemek tarifleriyle destekler.
    FitStorm, yemek planlama ve takibi konusunda kullanıcılara yardımcı olmanın yanı sıra, su içme hatırlatıcıları, ilerleme takibi ve popüler fitness uygulamalarıyla entegrasyon gibi çeşitli özellikler sunar. Kullanıcılar, uygulama üzerinden su içme düzenlerini takip edebilir, hedeflerine ne kadar yaklaştıklarını görebilir ve ilerlemelerini izleyebilirler. Ayrıca, FitStorm'un popüler fitness uygulamalarıyla entegrasyon özelliği sayesinde, egzersiz verilerini takip etmek ve beslenme hedefleriyle birlikte bütünsel bir sağlık yönetimi sağlamak da mümkündür.
    FitStorm'un temel amacı, kullanıcılara daha sağlıklı yiyecek seçimleri yapmalarına yardımcı olmak ve genel beslenmelerini iyileştirmek için bir rehberlik ve destek sağlamaktır. Uygulama, kullanıcı dostu bir arayüz ve kullanışlı özelliklerle donatılmıştır, böylece kullanıcılar hedeflerine ulaşmak ve sağlıklı yaşam tarzı alışkanlıkları geliştirmek için kolayca kullanabilirler. FitStorm, kullanıcıların beslenme ve sağlık hedeflerine ulaşmaları konusunda güvenilir bir yol arkadaşı olmayı hedeflemektedir.

## Veri Tabanı Diyagramı (ERM Diyagramı)

<img src="/img/resim%2024.jpg" alt="alt text" width="960" height="470">

1.	Meals tablosu, bütün food tablosundaki malzemelerden oluşan farklı türdeki yemeklerin id’lerinin, isimlerinin (name), tariflerinin (recipe), yemeğinin tipinin id’sinin (meal_type_id) ve yemeklerin resim adreslerinini(img_url)  bulundurur.
2.	Meal_type tablosunda bulunan yemeklerin bütün farklı olan tiplerinin id’lerini barındırır. Bu tablo meals tablosunda tekrar tekrar aynı isimleri yazmamak adına veri tasarrufu sağlanmak adına oluşturulmuştur.
3.	Food_in_the_meal tablosunda yemeklerin içinde bulunan malzemelerin her bir malzemeden ne kadar olduğu (quantity) ve miktar cinsi (unit) tutulmuştur. Ayrıca her bir yemek id si(meal_id) için içinde bulunan malzemenin (food_id) karşılarında olacak şekilde tutulmuştur.
4.	Minerals ve vitamins tablolarında vitaminlerin ve minerallerin isimleri ve bunlara karşılık gelen numaralar tutulmuştur. Böylece her bir vitamin ve mineralin artık birer numarası (id) vardır.
5.	Food_minerals ve food_vitamins tabloları vitaminlerin ve minerallerin tekrarlanması için her bir mineral ve vitamine birer id değeri vererek tutulması sağlanmıştır.
6.	Meal_times tablosunda öğünlerin adı (name) ve id leri tutulmuştur.
7.	Meal_times_meals tablosunda yemeklerin idlerleri (meal_d) ve bu yemeğin hangi öğünde yeniliyor ise o öğünün id’si (meal_time_id) tutulmuştur.
8.	Seasons tablosunda yiyeceklerin bulabileceği sezonların isimleri (name) ve bunlara karşılık gelecek id bilgileri tutulmuştur.
9.	Food_seasons tablosunda yiyeceklerin numaları (food_id) ve bu yiyeceğe karşılık gelecek olan sezon tablosundaki yer alan sezon numaraları (season_id)  karşılarında tutulmuştur.
10.	Diet_types tablosunda diyet adları (name) ve bublara karşılık gelecek numara (id) değerleri tutulmuştur.

11.	Food_diet_types tablosunda her bir yiyeceğin numaraları (food_id) ve ve o yiyeceğin hangi diyet tipine göre olduğunu tutulması istenilmiştir. Bu yüzden de Diet_types tablosundaki diyet numaralarına (diet_type_id)  göre eklenmiştir.

<img src="/img/resim%2025.jpg" alt="alt text" width="960" height="470">

12.	Yukarıda yer alan food tablosu, bir gıda maddesini soyut bir şekilde temsil eder ve gıdanın tanımlayıcısı (id), adı (name), türü (type),proteini (protein), yağı (fat) ve karbonhidratları (carbohydrates) fiyatları (price), resimlerinin adresleri (img_url), ürünün miktarı(quantity)  ve miktarının cinsi (unit) gibi öz niteliklere sahiptir. 


## Giriş Ekranı

<img src="/img/resim%201.png" alt="alt text" width="220" height="450">

- Projemiz için giriş ekranı olarak bu şekilde bir ekran olarak tasarlanmış olunmaktadır .Email ve Twitter olmak üzere 2 seçenek ile kayıt olabilme özelliği vardır. Zaten kullanıcının hesabı
var ise “Giriş Yap” Butonu ile kendi varolan hesabına giriş yapabilir.



## Üye Ol Ekranı

<img src="/img/resim%202.png" alt="alt text" width="220" height="450">

- “E-mail ile Kayıt Ol” butonuna tıklandığında kullanıcı adı, e-mail adresi, şifresi ve tekrar
şifresini girmesi gerekir. Şifreler uyuşmaz ise “Şifreleriniz uyuşmuyor lütfen tekrar giriniz” gibi
bir uyarılar gibi hatırlatmalar çıkmaktadır. Kullanıcının zaten bir hesabı var ise tekrardan giriş yap
sayfasına ulaşabilir.

## Giriş Yap Ekranı

<img src="/img/resim%2011.png" alt="alt text" width="220">

- Giriş yap ekranında kullanıcının kullanıcı adı veya e-mail adresini ve şifresini girmesi
gerekmektedir. Kullanıcı adı adı veya e-mail yanlış girildiği takdirde “Böyle bir kullanıcı
bulunmamaktadır” gibi bir uyarı ile karşılaşılır. Şifre yanlış yazıldığı takdirde ise “ Şifre ile
kullanıcı adı uyuşmuyor. Lütfen tekrar giriniz.” gibi bir uyarı ile kullanıcıyı bilgilendirilmektedir.


## Kişi Bilgilerinin Alındığı Ekran

<img src="/img/resim%203.png" alt="alt text" width="220" height="450">

- Bu sayfada kullanıcının genel fiziksel özellikleri hakkında bilgi almak için tasarlanmıştır.
Kullanıcnın girdiği veriler DataBase kısmında depolanılır ve Back-end tarafında bu verilen
bilgiler kullanılarak ve hesaplanarak kişiye en uygun olan günlük kalori miktarı ve alması
gereken besin miktarını bulmuş olunmaktadır. Böylece her kişiye özel olarak beslenme listesi
çıkmış olacaktır.


## Genel Hedef Ekranı

<img src="/img/resim%2012.png" alt="alt text" width="220" height="450">

- Bu sayfada kullanıcıdan hedeflerine yönelik butonlar bulunmaktadır.”Genel hedef” ve “Kesin Hedef” olarak ikiye ayrılan bu sayfada kullanıcıya neyi amaçladığı sorulmaktadır. Kullanıcı kilo verme, kilo alma, sabit kiloyu koruma ve kas kütlesi kazanma gibi seçenekler arasından istediğini hedefine uygun olanı seçmelidir. Böylece kişinin istediği amaca daha yönelik bir beslenme programı sunmuş olacağız.


## Kesin Hedef Ekranı 

<img src="/img/resim%2013.png" alt="alt text" width="220" height="450">

- Kesin hedef ekranında kullanıcıdan kesin bir kilo hedefi var ise o bilginin alınması amaclanmıştır. Bunu cevaplayıp cevaplamamak kullanıcının isteğine kalmış olup zorunlu değildir.

## Diyet Tipi Seçme Ekranı

<img src="/img/resim%2014.jpg" alt="alt text" width="240" height="450">

- Her insanın yemek tercihi farklıdır. Ve daha çok sevdiği ve tercih ettiği türler olabilir. O yüzden de sayfada kullanıcıdan diyet tipi hakkında bilgi alması amaçlanmıştır ve o yüzden tasarlanmıştır. Eğer özel bir tercihi yok ise “Her Şey” butonunu seçerek özel bir tercih yapmamış olacaktır. Eğer başka bir tip seçerse örneğin diyet tipi olarak Vejeteryan seçtiği takdirde bu tipe uygun diyet programını kullanıcıya sunmuş olacağız.

## Alerji Sorgusu Ekranı
<img src="/img/resim%2015.png" alt="alt text" width="220" height="400">

- Her insanın bazı besinlere alerjisi olabilir. Ve belkide yanlışlıkla yenmesi halinde ciddi sağlık sorunlarına yol açabilir.  Bu sayfa da bu yüzden kullanıcıdan alerjisi olduğu besinleri belirlenmesi için tasarlanmıştır. Burada amaç alerjisi olduğu besinlerin kullanıldığı yemekleri ve diğer besinleri programdan çıkarmak.Eğer bu bilgi baştan alınmamış olsaydı, kullanıcıya belki de bir sürü alerjisi olduğu besinlerle yapılan yemekler diyet programında çıkacaktı ve kullanıcı bunları tek tek silmek veya değiştirmek zorunda kalacaktı. Bu şekilde bu bilgi ilk başta alınarak kullanıcıya yönelik kolaylık sağlanması amaçlanmıştır. 

## Günlük Öğüne Harcanabilecek Bütçe Seçimi

<img src="/img/resim%2017.png" alt="alt text" width="220" height="450">

- Bu form ise kullanıcıya öğüne harcayabileceği günlük miktarı yani bütçesini sorup ona göre diyet listesi oluştururken kullanabileceğimiz bir formdur.


## Profil Sayfası 
<img src="/img/resim8.png" alt="alt text" width="220" height="450">

- Kullanıcı “ToolBar” kısmında en sağdaki “Profil” butonuna tıkladığında bu sayfa açılacaktır. Bu sayfada kullanıcı Firebase’de realtime veritabanında tutulan verilerini görebilecektir.

## Menü Oluşturma Sayfası
<img src="/img/resim%2020.png" alt="alt text" width="220" height="500">

- Kullanıcının girdiği verilere uygun menü oluşturmak amaçlanmıştır. 


## Arama Sayfası 

<img src="/img/video%201.gif" alt="alt text" width="220" height="450">


- Veritabanında saklı tutulan tüm yemek verilerinin içinde yer alan harflere göre
aratılabildiği kısımdır. Herhangi bir yemeğe tıklanıldığında yemek bilgileri görünecektir.


<img src="/img/resim%2023.png" alt="alt text" width="220" height="450">


- Yemek bilgilerinde kalorinin yanı sıra yağ,protein ve karbonhidrat bilgileri de yer almaktadır. Favorilere alma işlemi de buradan yapılmaktadır.

## Alışveriş Listesi Kısmı 

<img src="/img/video%202.gif" alt="alt text" width="220" height="450">

- Bu kısımda ise o günkü öğün için gerekli olan tüm yemekler için gerekli olan yiyeceklerin listesi ve alışverişe çıkıldığında gerekli olan fiyatları da gözükmektedir.

## Tanıtım Videosu
<img src="/img/video%203.gif" alt="alt text" width="960" height="470">

## Sonuçlar
- Sonuç olarakDatabase Python dilindeki psycopg2 kütüphanesi kullanılarak datasetlerdeki gerekli düzenlemeler yapılarak doldurulmuştur.
- Projemizde amaçladığımız random seçtiğimiz yemeklerden bir menü planlaması oluşturmak ve veritabanımızda yer alan yemeklere uygun bir algoritma sürecinin oluşturulması , kullanıcıdan alınan bilgilere göre bir menü planı oluşturması ve bütçe seçimine göre kullanıcı dostu bir uygulama tasarlanması amaçlanmış ve oluşturulmuştur.
- Bu oluşturulan menünün içindekileri kapsayacak bir de besin listesinden oluşan alışveriş listesi çıkartılıp kullanıcının erişimine sunulmuştur. Burada kullanıcı besinlerin market fiyat bilgilerine de ulaşabilmektedir.
- Kullanıcının veritabanındaki tüm yemeklere erişimini sağlayacak bir arama formu tasarlanmış. Bu sayede kullanıcı herhangi bir yemeğe tıkladığında yemeğin gram cinsinden karbonhidrat, protein ve yağ değerlerine ulaşması sağlanmış.
- Kalori olarak değerine de erişmesi sağlanmıştır.
- İstediği yemeğe tıklayıp favorilerinde bu yemeği saklı tutabilmesi de sağlanmıştır.


