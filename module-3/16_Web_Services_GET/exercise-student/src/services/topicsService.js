import axios from 'axios';
const theHttp = axios.create({
 baseURL: "http://localhost:3000/"
});
export default {
    theTopics(){
        return theHttp.get('/topics')
    },

   // get(id) {
    //    return theHttp.get(/topics/${id})
    //    }

}
and this for topicsList
<template>
  <div class="topic-list">
    <div v-for="topic in topics" v-bind:key="topic.id" class="topic">
      {{ topic.title }}
    </div>
  </div>
</template>

<script>
import topicsService from "../services/topics"

export default {
  name: 'topic-list',
  data() {
    return {
      topics: []
    }
  },
  created() {
 topicsService.theTopics().then((response) => {
 this.topics = response.data;
 });
 
 }



}
</script>
