
console.log("My Weather app !!")
const url = 'https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=Mumbai';
const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '07fd3549bemshdeffdc65b0598aap11450djsneff6c3e08e9e',
		'X-RapidAPI-Host': 'weather-by-api-ninjas.p.rapidapi.com'
	}
};

async function get_data()
{
    try {
        const response = await fetch(url, options);
        const result = await response.text();
        console.log(result);
    } catch (error) {
        console.error(error);
    }
}

get_data()
