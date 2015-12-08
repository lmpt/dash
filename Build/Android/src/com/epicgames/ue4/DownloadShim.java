package com.epicgames.ue4;

import com.YourCompany.bDash01.OBBDownloaderService;
import com.YourCompany.bDash01.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

