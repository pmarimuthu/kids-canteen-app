
//import { axios } from 'axios';

app.component('menu-item', {
    props: {
        dishName: {
            type: String,
            required: true
        }
    },
    template:
        /*html*/
        `<div>
            {{ this.allMenuItems }}
            <table>
                <tr>
                    <td>
                        <a href="https://developer.mozilla.org">
                            <img src="https://developer.mozilla.org/static/img/favicon144.png" 
                            alt="Visit the MDN site">
                        </a>
                    </td>

                    <td>
                        <div>
                            <p> {{ dishName }} </p>
                            <p> {{ shortDescription }} </p>
                            <p> {{ isVegOrNonveg }} </p>
                            <p> {{ dishMainCategory }} </p>
                            <p> {{ dishSubCategory }} </p>
                            <p> {{ unitPrice }} </p>
                        </div>
                    </td>
                </tr>
            </table>
        </div>`
    ,
    data() {
        return {
            dishName: 'name',
            shortDescription: 'desc',
            isVegOrNonveg: 'veg',
            dishMainCategory: 'main',
            dishSubCategory: 'breakfast',
            unitPrice: '0.99'
        }
    }

})