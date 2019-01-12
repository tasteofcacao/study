package com.spring.dev_nsj.article.controller;

import com.spring.dev_nsj.article.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
@RequestMapping("/nsj")
public class ArticleController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

	private final ArticleService articleService;

	@Inject
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}
//
//    @RequestMapping(value = "/write", method = RequestMethod.GET)
//    public String writeGET() {
//
//        logger.info("normal writeGET() called...");
//
//        return "article/normal/write";
//    }
//
//    @RequestMapping(value = "/write", method = RequestMethod.POST)
//    public String writePOST(TestVO articleVO,
//                            RedirectAttributes redirectAttributes) throws Exception {
//
//        logger.info("normal writePOST() called...");
//        logger.info(articleVO.toString());
//        testService.create(articleVO);
//        redirectAttributes.addFlashAttribute("msg", "regSuccess");
//
//        return "redirect:/article/normal/list";
//    }

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		logger.info("Article : normal list() called ...");
		model.addAttribute("articles", articleService.listAll());
	
		return "test";
	}

//    @RequestMapping(value = "/listCriteria", method = RequestMethod.GET)
//    public String listCriteria(Model model, Criteria criteria) throws Exception {
//        logger.info("normal listCriteria() ...");
//        model.addAttribute("articles", testService.listCriteria(criteria));
//        return "article/normal/list_criteria";
//    }
//
//    @RequestMapping(value = "/read", method = RequestMethod.GET)
//    public String read(@RequestParam("articleNo") int articleNo,
//                       Model model) throws Exception {
//
//        logger.info("normal read() called ...");
//        model.addAttribute("article", testService.read(articleNo));
//
//        return "article/normal/read";
//    }
//
//    @RequestMapping(value = "/modify", method = RequestMethod.GET)
//    public String modifyGET(@RequestParam("articleNo") int articleNo,
//                            Model model) throws Exception {
//
//        logger.info("normal modifyGet() called ...");
//        model.addAttribute("article", testService.read(articleNo));
//
//        return "article/normal/modify";
//    }
//
//    @RequestMapping(value = "/modify", method = RequestMethod.POST)
//    public String modifyPOST(TestVO articleVO,
//                             RedirectAttributes redirectAttributes) throws Exception {
//
//        logger.info("normal modifyPOST() called ...");
//        testService.update(articleVO);
//        redirectAttributes.addFlashAttribute("msg", "modSuccess");
//
//        return "redirect:/article/list";
//    }
//
//    @RequestMapping(value = "/remove", method = RequestMethod.POST)
//    public String remove(@RequestParam("articleNo") int articleNo,
//                         RedirectAttributes redirectAttributes) throws Exception {
//
//        logger.info("normal remove() ...");
//        testService.delete(articleNo);
//        redirectAttributes.addFlashAttribute("msg", "delSuccess");
//
//        return "redirect:/article/list";
//    }

}
