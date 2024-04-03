package com.example.projectreview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.projectreview.model.Donor;
import com.example.projectreview.repository.DonorRepo;

@Service
public class DonorService {
    
    @Autowired
    DonorRepo dr;
    
    public Donor create(Donor dd)
    {
        return dr.save(dd);
    }

    public List <Donor> getAlldetails()
    {
        return dr.findAll();
    }
    public Donor getDonorById(int id)
    {
        return dr.findById(id).orElse(null);
    }

    public boolean updateDetails(int id,Donor u)
        {
            if(this.getDonorById(id)==null)
            {
                return false;
            }
            try{
                dr.save(u);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }

        public boolean deleteDonor(int id)
        {
            if(this.getDonorById(id) == null)
            {
                return false;
            }
            dr.deleteById(id);
            return true;
        }
         public List<Donor> getsort(int pageNumber,int pageSize,String field)
    {          
        return dr.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }

    }
           
        


