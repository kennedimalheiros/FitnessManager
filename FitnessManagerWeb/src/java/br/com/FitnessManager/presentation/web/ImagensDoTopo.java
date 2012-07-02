package br.com.FitnessManager.presentation.web;

import java.util.ArrayList;  
import java.util.List;    
public class ImagensDoTopo {  
  
    private List<String> images;  
  
   public void ImageSwitchBean() {  
        images = new ArrayList<String>();  
        images.add("exercicios/supino.jpg");  
        images.add("exercicios/puley.jpg");  
        images.add("exercicios/legpress.jpg");  
        images.add("exercicios/supino.jpg");  
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
}  