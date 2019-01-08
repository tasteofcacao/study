package com.spring.test.controller;

import com.spring.test.service.TestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;

@Controller
@RequestMapping("/test2")
public class TestController2 {

    private static final Logger logger = LoggerFactory.getLogger(TestController2.class);

    private final TestService testService;

    @Inject
    public TestController2(TestService testService) {
        this.testService = testService;
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
    public String list(Model model) throws Exception 
    {
    		logger.info("normal list() called ...");
    		model.addAttribute("articles", testService.listAll());
    		
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
