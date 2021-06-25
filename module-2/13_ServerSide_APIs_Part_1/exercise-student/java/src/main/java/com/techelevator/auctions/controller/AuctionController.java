package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@requestmapping B4 the Controller class
//set the default base path for all paths specified in other @requestmapping
@RestController
@RequestMapping("/auctions")

public class AuctionController {

    private MemoryAuctionDAO dao;

    public AuctionController() {

        this.dao = new MemoryAuctionDAO();
    }
//controller  method here step 2
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list() {
        System.out.println("List of Auctions");
        return dao.list();
    }

    //step 3
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
       //System.out.println("/auction/" + id + "path received from server");
       return dao.get(id);
    }

    //part 4
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction addAAuction(@RequestBody Auction aAuction) {
        Auction theAuction = dao.create(aAuction);
        return theAuction;
    }

    //part 5
} //end of class
