<template>
  <div class="well">
    <span class="amount" v-on:click="updateFilter()">{{ numberOfReviews }}</span>
    {{ rating }} Star Review{{ numberOfReviews === 1 ? '' : 's' }}
  </div>
</template>

<script>
export default {
  name: "star-summary",
  props: ["rating"],  // rating will be passed to us from whomever uses this component
  methods: {
    updateFilter() {  // We will write code for this method
      this.$store.commit("UPDATE_FILTER",parseInt(this.rating))  // since filter is in the data store =, use mutation
    }
  },
  computed: {
    numberOfReviews() {
      const reviews = this.$store.state.reviews;  // get the reviews array from the Vuex data store
      return reviews.reduce((currentCount, review) => {
        // convert the rating from a string to a number using parseInt()
        // Add a 1 or a 0 to current count depending on review rating equal rating we want
        return currentCount + (review.rating === parseInt(this.rating) ? 1 : 0);
      }, 0);
    }
  }
};
</script>

