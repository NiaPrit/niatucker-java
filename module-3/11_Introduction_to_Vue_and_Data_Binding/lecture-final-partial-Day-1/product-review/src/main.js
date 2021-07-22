// This is generated by the vue create command

// This is the first JavaScript program run when Vue application is started
// This of it as the "main method" of your Vue application
// It will instantiate an instance of Vue and cause teh Vue home page (App,vue)
//         to be inserted into the index.html before it is sent to the browser
//
// There pretty much no reason to ever change anything in the main.js generated by vue create

import Vue from 'vue'                // Access to Vue stuff
import App from './App.vue'          // Access to Vue home page (App.vue)

Vue.config.productionTip = false     // Disable hints about Vue from App
                                     // no longer needed - this is the default 

new Vue({                            // Create an instance of Vue for the application
  render: h => h(App),               // render: tells Vue what the main/home page component is called
                                     //         must match the import name
}).$mount('#app')                    // .$mount() method tells Vue where in the index.html components
                                     //           should be added
                                     // #app - html element with id="app"