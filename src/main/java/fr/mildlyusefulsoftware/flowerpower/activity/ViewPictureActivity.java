package fr.mildlyusefulsoftware.flowerpower.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a14fe5cdc1e96c5";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower23.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower28.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower2.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower21.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower24.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower26.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower5.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower14.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower35.jpg",
				"http://www.photographyblogger.net/wp-content/uploads/2010/05/flower32.jpg",
				"http://www.nolenandsue.com/photos/Beautiful%20Flower.jpg",
				"http://files.myopera.com/xemanhdep/albums/588328/beautiful_flower29.jpg",
				"http://files.myopera.com/xemanhdep/albums/588328/beautiful_flower07.jpg",
				"http://files.myopera.com/xemanhdep/albums/588328/beautiful_flower13.jpg",
				"http://www.aix-photo.com/photo/fleurs.jpg",
				"http://canelle62.c.a.pic.centerblog.net/echkrqp0.jpg",
				"http://theotime.colin.free.fr/IMG/jpg/fond-d-ecran-fleur-fleurs-macro.jpg",
				"http://www.oositoo.com/galerie-photos/photos/fleurs/nenuphares/nenuphares-02.jpg",
				"http://c.imdoc.fr/1/grossesse/photos-fleurs/photo/2734235273/791397f98/photos-fleurs-fleurs-img.jpg",
				"http://i277.photobucket.com/albums/kk48/letsgodeco/Fleurs/PicsFleursPicsGreen032.jpg",
				"http://www.journaldesfemmes.com/jardin/fleur/des-fleurs-a-votre-image/image/fleurs-a-image-538904.jpg",
				"http://www.nimbustier.net/photos/2005/03/b/2005-03-24-006.jpg",
				"http://www.azurs.net/photographies/fleurs_mauves_jardin_scy_chazelles.jpg",
				"http://www.bricokid.com/images/realisation/big/fleur_window_color_bk_wc_fleur04.jpg",
				"http://b.imdoc.fr/1/divers/nature/photo/5081728508/932756186/nature-fleurs-roses-nature-img.jpg",
				"http://www.photo-fotos.com/galleries/FLEURS/fleurs-bleues-blanches-violet.jpg",
				"http://images.doctissimo.fr/1/grossesse/photos-fleurs/photo/hd/2734235273/791408463/photos-fleurs-fleurs-big.jpg",
				"http://media1.voyages.woopic.com/medias/images/voyager-en-images/normales/fleurs-de-montagne-au-col-du-lautaret-france-rhone-alpes_89515.jpg",
				"http://jardintropical.net/fleurs/images/fleur-de-frangipanier.jpg",
				"http://t2.gstatic.com/images?q=tbn:ANd9GcRfKkpPQQdPCTn1nvElW5WKuiShDU8BFrepTiNq7PNcCaTkg8n0-v7t2AImAg",
				"http://smsread.com/blog/home/smsreadc/public_html/blog/wp-content/uploads/2012/02/blooms-flowers.jpg",
				"http://2.bp.blogspot.com/_HkbWdsz-H8g/S73sSjmMGiI/AAAAAAAAIYE/AGiFA9xn0CI/s1600/beautiful+yellow+rose.jpg",
				"http://thundafunda.com/393/images/wallpapers/flowers/1298-plants-beautiful-flowers-pictures-wallpapers.jpg",
				"http://www.bestesoft.com/imgbest/3/4/jtca0012.jpg",
				"http://hosting.onlinefreemovies4u.net/images/9031273825169_BQY4LET.jpg",
				"http://hosting.onlinefreemovies4u.net/images/841Semblance_Wallpaper_by.jpg",
				"http://hosting.onlinefreemovies4u.net/images/659Flowers_Wallpapers.jpg",
				"http://gilygily.com/wp-content/uploads/2011/08/flowers_23.jpg",
				"http://4.bp.blogspot.com/_yHiFoQCk1dc/S_7pAR0289I/AAAAAAAAAlw/qXdjx-AAnvg/s1600/lotus-flower-wallpaper.jpg",
				"http://www.wallpaperpimper.com/wallpaper/Flower/Daisy/Beautiful-Flowers-240-JQ3PB0LC87-800x600.jpg",
				"http://islamic-creed.com/2007%20screensavers/Beautiful%20Flowers%203.jpg",
				"http://www.sendmyflower.com/wp-content/uploads/2011/04/Beautiful-Blooming-Flowers-Pictures-And-Wallpapers15.jpg",
				"http://wfiles.brothersoft.com/b/beautiful_flowers_hd_51007-1280x1024.jpg",
				"http://www.graphics99.com/wp-content/uploads/2012/02/holidays-international-womens-day-beautiful-flowers-to-women.jpg",
				"http://stanford.edu/~grg/images/orange_flower.jpg",
				"http://static.desktopnexus.com/thumbnails/339858-bigthumbnail.jpg",
				"http://di9.in/wallpapers/beautiful_flowers-1920x1200.jpg",
				"http://t2.gstatic.com/images?q=tbn:ANd9GcSyNuRj0_K24-bfxTIkpwmlGXKFjInzxX5_UkglvCevLsJzM54w4-NQJ4gDrA",
				"http://beautiful-flowers.russian-women.net/desktop-wallpapers-photos-en/pictures-1152-864/image-wallpaper-1152-864-Beautiful-Flowers-Flowers-Ni328884.jpg",
				"http://images.travelpod.com/tripwow/photos/ta-00a1-821a-477e/beautiful-flowers-kihei-united-states+1152_12838192650-tpfil02aw-4596.jpg",
				"http://beautiful-flowers-pictures.andrewkarpov.com/desktop-wallpapers-pictures-en/pictures-1280-960/image-wallpaper-1280-960-Beautiful-Flowers-Chrysanthemum-Flowers-pictures-Ni345646.jpg",
				"http://www.jaugustinephotography.com/storage/Tulips.jpg?__SQUARESPACE_CACHEVERSION=1302140338741",
				"http://www.flowerpicturegallery.com/d/3951-2/beautiful+bright+purple+orchid+flowers.jpg",
				"http://images4.fanpop.com/image/photos/17000000/beautiful-flowers-shiriny-17027540-500-376.jpg",
				"http://beautiful-flowers.russian-women.net/desktop-wallpapers-photos-en/pictures-1024-600/image-wallpaper-1024-600-Beautiful-Flowers-Roses-of-the-Riviera-Park-Flowers-Ni767307.jpg",
				"http://static1.pixdaus.com/files/items/pics/3/42/518342_2a5d7032e4ba84b94d38819103bc9d83_large.jpg",
				"http://free.bridal-shower-themes.com/img/the-most-beautiful-flower-on-earth_2.jpg",
				"http://4.bp.blogspot.com/-XQ_Zyl2Telk/T0yCWkn4IsI/AAAAAAAABXk/vOCmCv50jmc/s1600/spring+flowers+(12).jpg",
				"http://wallpaperstock.net/yellow-flowers_wallpapers_16087_1920x1440.jpg",
				"http://4.bp.blogspot.com/-xUWZOiVSF-A/T0yC07qPvZI/AAAAAAAABZM/z4Oygo0RDXg/s1600/spring+flowers+(9).jpg"
		
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("flowerpower",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
