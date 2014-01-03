package kk.test.TwilightChargingDaydream;

import android.service.dreams.DreamService;
import android.webkit.WebView;

public class TwilightDreamService extends DreamService {

	public void onDreamingStarted() {
		super.onCreate();
		
		setInteractive(true);
		setFullscreen(true);
		setScreenBright(false);

		setContentView(R.layout.daydreamlayout);
		WebView gifWebView = (WebView) findViewById(R.id.gifwebview);
		gifWebView.loadUrl("file:///android_asset/dream_view.html");
	}
}
