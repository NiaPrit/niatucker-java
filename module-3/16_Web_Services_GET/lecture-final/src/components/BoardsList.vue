<template>
  <div>
    <h1>My Kanban Boards</h1>
    <div class="boards">
      <!-- this div will display a "progess indicator" while the page is loading                   -->
      <!-- it uses a variable called isLoading to determine if the page is loading or not          -->
      <!-- the v-if will show this div if page is loading (isLoading:true) and hide it if it's not -->
      <!-- isLoading is initially set to true and is set false when page loading process is done   -->
      <div class="loading" v-if="isLoading">
        <img src="../assets/squirrel.gif" />  <!-- progress indicator  -->
      </div>
      <!-- this is the main div for the page                                                        -->
      <!-- v-else goes with the previous v-if and indicates to display div when v-if is false       -->
      <!-- this div will generated once for each element in boards (boards is data source for page) -->
      <!-- boards must have data before the page is generated by Vue                                -->
      <div
        class="board"
        v-for="board in boards"
        v-bind:key="board.id"
        v-bind:style="{ 'background-color': board.backgroundColor }"
        v-else
      >
        <!-- define a link to 'Board' router path with the board.id for each div displayed (board.title) -->
        <router-link v-bind:to="{ name: 'Board', params: { id: board.id } }">
          {{ board.title }}
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
import boardsService from '../services/BoardService'; // Access the code in BoardService.js

export default {
  data() {
    return {
      boards: [],       // Holds the boards that will displayed on the page
      isLoading: true   // Used to indicate if the page is in the process of being loaded (true)
    };
  },
  // The created() lifecycle hook allows us to go some processing 
  //      before the html for the page is generated by Vue
  // For this page we need to get the data be displayed on the page and indicate page is done loading
  // the boards data is in server resouce that we must use an API call to retrieve
  // Using the App --> service --> API-server model, we call a service which returns the data
 
  // Since we don't know how long the API call will take to complete,
  //       if subsequent processing depends on the API call, we need to wait until it's done
  //
  // When you do an async call to API, the call issues a promise
  // a promise is notification from the API call it will tell you when it is done
  //
  // when promise is fulfilled, the response object is returned from the API call
  //                            the reponse object contains data        - any data returned by request
  //                                                        status      - HTTP status code
  //                                                        status text - description of status code
  //
  // .then() for an API call says when the promise is fulfilled (API call completes), do this processing
 created() {
    boardsService.getBoards()        // call getBoards() in boardsService (does an async call to API)
                                     //      getBoards() returns the response object from the API call
                 .then(response => { // wait for the async API call to be done - send the reponse to anon-func
                      this.boards = response.data;  // copy the data from the response to boards array
                                                    //    since the only returned is the array we can use .data
                      this.isLoading = false;       // indicate the page is done loading after this process is done
                  });
  }
};
</script>

<style scoped>
.boards {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.board {
  background-color: #f7fafc;
  border-radius: 10px;
  padding: 40px;
  flex: 1;
  margin: 0 20px;
  text-align: center;
}
.loading {
  flex: 3;
}
.board a:link,
.board a:visited {
  color: rgb(243, 243, 243);
  text-decoration: none;
}
</style>
