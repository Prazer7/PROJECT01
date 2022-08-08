package kr.co.ictedu.video;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping( value = "/video" )
public class VideoController {
	

		@RequestMapping( value = "/video", method = RequestMethod.GET )
		public String video() {
			return "/video/video";//jsp file name
		}//video
	} 

